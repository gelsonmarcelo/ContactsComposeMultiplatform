package com.plcoding.contactscomposemultiplatform.contacts.domain

import kotlinx.coroutines.flow.Flow

interface ContactDataSource {
    fun getContacts(): Flow<List<Contact>> //Todo These don't need suspend because Flow calls it already
    fun getRecentContacts(amount: Int): Flow<List<Contact>>
    suspend fun insertContact(contact: Contact)
    suspend fun deleteContact(id: Long)
}