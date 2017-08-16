import scala.reflect.runtime.{universe=>ru}

/**
  * Created by praveen on 3/31/16.
  */
object Reflection {
  def getTypeTag[T: ru.TypeTag](obj: T) = ru.typeTag[T]

  def main(args: Array[String]) {
    val m = ru.runtimeMirror(getClass.getClassLoader)

    var clazz = m.staticClass("Person")

    val theType = clazz.toType
    val cm = m.reflectClass(clazz)
    val ctor = theType.decl(ru.termNames.CONSTRUCTOR).asMethod
    val ctorm = cm.reflectConstructor(ctor)
    val p = ctorm("Mike")

    val im = m.reflect(p)

    val names = theType.decls.map(symbol => symbol.fullName)

    println(theType.decls.head.asTerm.info)

    println(theType.dealias.typeParams)
  }

}
