package ua.innovects.controller

import java.io.FileNotFoundException

import scala.io.Source

/**
  * Created by dexter on 04.12.16.
  */
object Controller extends App {

  try {
    val source =  Source.fromFile("src/main/resources/file.file")
    val text = try source.mkString finally source.close()
    println(text)
  }  catch {
    case e: FileNotFoundException => println("FileNotException")
  }

}
