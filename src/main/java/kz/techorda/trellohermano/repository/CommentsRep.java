package kz.techorda.trellohermano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRep extends JpaRepository<CommentsRep,Long> {
}
