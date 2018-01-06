class Rational(n: Int, d: Int) extends Ordered[Rational] {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString: String = s"$numerator/$denominator"

  def +(that: Rational): Rational =
    new Rational(
      this.numerator * that.denominator + that.numerator * this.denominator,
      this.denominator * that.denominator
    )

  def +(i: Int): Rational =
    this + new Rational(i)

  def -(that: Rational): Rational =
    new Rational(
      this.numerator * that.denominator - that.numerator * this.denominator,
      this.denominator * that.denominator
    )

  def -(i: Int): Rational =
    this - new Rational(i)

  def *(that: Rational): Rational =
    new Rational(
      this.numerator * that.numerator,
      this.denominator * that.denominator
    )

  def *(i: Int): Rational =
    this * new Rational(i)

  def /(that: Rational): Rational =
    this * new Rational(that.denominator, that.numerator)

  def /(i: Int): Rational =
    this / new Rational(i)

  def lessThan(that: Rational): Boolean =
    this.numerator * that.denominator < that.numerator * this.denominator

  def max(that: Rational): Rational =
    if (lessThan(that)) that else this

  override def compare(that: Rational): Int =
    this.numerator * that.denominator - that.numerator * this.denominator

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
