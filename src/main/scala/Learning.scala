import expr.{BinOp, Number, Var}

object Learning extends App {

  BinOp("+",
    BinOp("*",
      BinOp("+", Var("x"), Var("y")),
      Var("z")),
    Number(1))
}
