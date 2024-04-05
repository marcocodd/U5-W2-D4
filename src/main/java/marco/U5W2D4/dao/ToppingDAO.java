package marco.U5W2D4.dao;

import marco.U5W2D4.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingDAO extends JpaRepository<Topping, Long> {
}
