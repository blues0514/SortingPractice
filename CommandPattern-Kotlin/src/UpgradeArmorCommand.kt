class UpgradeArmorCommand(marine: Marine) : Command(marine) {
    override fun execute() {
        marine.armor += 1
        println("방업 " + marine.armor)
    }
}