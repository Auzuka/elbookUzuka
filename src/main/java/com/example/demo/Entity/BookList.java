package com.example.demo.Entity;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class BookList {

	private int book_id;

	private String book_name;

	private String book_author;

	private String book_publisher;

	private String book_releasetime;

	private Date create_time;

	private LocalDateTime update_time;

	//ファイルアップロードのため必要
	private MultipartFile file;

	private String file_name;

	private int stock;

}
