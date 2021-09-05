CREATE TABLE IF NOT EXISTS book (
   isbn int AUTO_INCREMENT PRIMARY KEY,
   book_name varchar(60) NOT NULL,
   number_of_pages int  NOT NULL,
   current_page int ,
   author varchar(30)  not null,
   book_status_decsription varchar(60) ,
   last_updated TIMESTAMP NOT NULL DEFAULT now(),
   year int check (year > 1900)
 );
  

