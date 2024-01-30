package com.journal.journal.repositories;

import com.journal.journal.entities.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId> {

}

//Best practice
//Controller ----> service ----> Repository