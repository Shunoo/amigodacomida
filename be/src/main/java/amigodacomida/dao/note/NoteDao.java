package amigodacomida.dao.note;

import amigodacomida.entity.note.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteDao extends JpaRepository<Note,Integer> {
}
