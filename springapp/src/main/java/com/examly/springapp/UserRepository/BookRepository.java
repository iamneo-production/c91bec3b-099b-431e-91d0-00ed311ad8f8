package com.examly.springapp.UserRepository;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	@Query("Select book  FROM Book book WHERE book.user_id=:user_id")
	List<Book> getByuserId(@Param("user_id")Long user_id);

}
