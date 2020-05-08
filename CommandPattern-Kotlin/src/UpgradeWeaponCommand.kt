class UpgradeWeaponCommand(marine: Marine) : Command(marine) {
    override fun execute() {
        marine.weapon += 1
        println("공업 " + marine.weapon)
    }
}