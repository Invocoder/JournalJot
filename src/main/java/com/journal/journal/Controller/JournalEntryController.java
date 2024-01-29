package com.journal.journal.Controller;

//Special types of components/classes which handle our HTTP(GET/PUT/POST/DELETE) requests.

import com.journal.journal.entities.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
   //@GetMapping("/feed")
   @GetMapping
   public List<JournalEntry> getAll()
   {
      return new ArrayList<>(journalEntries.values());
   }
   @PostMapping
   public boolean createEntry(@RequestBody JournalEntry userEntry)
   {
      journalEntries.put(userEntry.getId(), userEntry);
      return true;
   }

   @GetMapping("id/{myId}")
   public JournalEntry getEntryById(@PathVariable Long myId)
   {
      return journalEntries.get(myId);
   }
   @DeleteMapping("id/{myId}")
   public JournalEntry deleteEntryById(@PathVariable Long myId)
   {
     return journalEntries.remove(myId);
   }
   @PutMapping("id/{id}")
   private JournalEntry updateEntryById(@PathVariable Long id, @RequestBody JournalEntry userEntry)
   {
        return journalEntries.put(id, userEntry);
   }
}
