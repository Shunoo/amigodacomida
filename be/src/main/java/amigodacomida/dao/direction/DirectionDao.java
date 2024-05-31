package amigodacomida.dao.direction;

import amigodacomida.entity.direction.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionDao extends JpaRepository<Direction,Integer> {
}
