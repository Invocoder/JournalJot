package com.journal.journal.services;

import com.journal.journal.entities.JournalEntry;
import com.journal.journal.repositories.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
  @Autowired
    private JournalEntryRepo journalEntryRepo;

  public List<JournalEntry> getAll()
  {
     return journalEntryRepo.findAll();
  }
    public void saveEntry(JournalEntry journalEntry)
    {
        journalEntryRepo.save(journalEntry);
    }
    public Optional<JournalEntry> findById(ObjectId id)
    {
       return journalEntryRepo.findById(id);
    }
    public void deleteById(ObjectId id)
    {
        journalEntryRepo.deleteById(id);
    }
}
