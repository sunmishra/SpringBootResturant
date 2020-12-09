package sh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import sh.entities.Menu;

public interface MenuRepo  extends JpaRepository<Menu, Integer>{


}