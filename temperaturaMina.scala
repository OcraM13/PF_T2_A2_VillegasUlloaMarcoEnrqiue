import scala.collection.mutable.ArrayBuffer

object temperaturaMina {
  
   def main(args: Array[String]): Unit ={
     
     val r = scala.util.Random
     
      val temperaturas = new Array[Int](48)
      val temperaturaIdeal = new ArrayBuffer[Int]()
      var tiempo = 0
      var promedio = 0
      
      for( i <- 0 to 47){
        
        if(i%2 == 0){
          temperaturas(i) = tiempo
          tiempo += 1
          
        }else{
          temperaturas(i) = r.nextInt(50)
        }
        
      }
     
      for( i <- 1 to 47 by 2 ){
      
        if(temperaturas(i) == 25){
          println("Hora: " +  temperaturas(i-1) + " Temperatura: 25")
          temperaturaIdeal+=temperaturas(i-1)
          temperaturaIdeal+=25
        }
      
      }
      
      for( i <- 0 to temperaturaIdeal.length -1 by 2 ){
        promedio += temperaturaIdeal(i)
      }
      
      if(temperaturaIdeal.length != 0){
        println("Promedio de las Horas de las condiciones ideales: " + promedio/(temperaturaIdeal.length/2))
      }else{
        println("No hay temperatura ideal")
      }
      
      
      
   }
  
}