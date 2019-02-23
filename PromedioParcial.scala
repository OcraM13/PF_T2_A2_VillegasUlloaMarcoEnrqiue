import scala.collection.mutable.ArrayBuffer


object PromedioParcial {

  
   def promedio(parcial:Array[Int]): Float ={
     
     var promedio: Float = 0
     
      for(x <- parcial){
        
        promedio += x
        
      }
     
      promedio/6
   }
   
   def promedioGeneral(parcial:Array[Float]): Float={
     
     var promedio: Float = 0
     
      for(x <- parcial){
        
        promedio += x
        
      }
     
      promedio/4
   }
  
   def main(args: Array[String]): Unit ={
      
      val parcial1 = Array( 60, 80, 70, 80, 80, 70)
      val parcial2 = Array( 90, 70, 60, 60, 70, 90)
      val parcial3 = Array( 60, 90, 90, 60, 70, 70)
      val parcial4 = Array( 60, 70, 80, 60, 60, 60)
      
      val parciales = Array(promedio(parcial1), promedio(parcial2), promedio(parcial3), promedio(parcial4))
      
      var general = promedioGeneral(parciales)
      
      println("Promedio por parcial")
      print("P1: ")
      print(parciales(0))
      print(" ")
      print("P2: ")
      print(parciales(1))
      print(" ")
      print("P3: ")
      print(parciales(2))
      print(" ")
      print("P4: ")
      print(parciales(3))
      print(" ")
 
      println("promedio General")
      println(general)
      
    }
}