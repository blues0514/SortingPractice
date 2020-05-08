class MoveCommand(marine: Marine, private val x: Int, private val y: Int) : Command(marine) {
    override fun execute() {
        marine.x = x
        marine.y = y
        System.out.printf("%d, %d로 이동\n", x, y)
    }

}