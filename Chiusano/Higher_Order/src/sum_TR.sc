// Tail Recursion Version of sum

def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(x: Int, acc: Int): Int = {
    if (x > b) acc
    else loop(x + 1, acc + f(x))
  }
  loop(a, 0)
}
sum(x => x, 1, 5) // res0: Int = 15
