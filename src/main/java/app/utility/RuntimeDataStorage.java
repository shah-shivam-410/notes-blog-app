package app.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.entites.Note;

public class RuntimeDataStorage {
	
	private static final Map<Integer, Note> notesMap = new HashMap<>();
	
	public void upsertNote(Note t) {
		notesMap.put(t.getId(), t);
	}

	public void removeNote(Integer id) {
		notesMap.remove(id);
	}
	
	public Note getNote(Integer id) {
		return notesMap.get(id);
	}
	
	public List<Note> getAllNotes() {
		return new ArrayList<Note>(notesMap.values());
	}
}
