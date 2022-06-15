import scala.math.sqrt
import scala.math.pow

object Fibonacci extends App{

  def fiboRecursive(n: Int): Int = {
    n match {
    case 0 => 0
    case 1 => 1
    case 2 => 1
    case x => fiboRecursive(n-1) + fiboRecursive(n-2) + fiboRecursive(n-3)
    }
  }
}
