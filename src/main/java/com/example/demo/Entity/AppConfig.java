package com.example.demo.Entity;

import java.io.File;

import lombok.Data;

@Data
public class AppConfig {

	//Fileクラスはパス情報を保持したり、ファイル操作やディレクトリ操作するためのクラス。
	private File imageDir;
	
}