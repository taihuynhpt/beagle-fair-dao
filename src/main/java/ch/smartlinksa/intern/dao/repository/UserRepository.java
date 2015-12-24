package ch.smartlinksa.intern.dao.repository;

import ch.smartlinksa.intern.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
