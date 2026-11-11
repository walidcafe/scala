object Test extends App {
  def f(s: String): String = "1"
  val f: (String) => String = s => "2"

  val t: String => String = f

  // https://github.com/scala/bug/issues/9395#issuecomment-2440062208
  assert(t("") == "2")
}
