object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val marine = Marine()

        // TDD(Test-Driven Development)
        // 공업(예약)
        CommanderManager.add(UpgradeWeaponCommand(marine))
        // 50, 100으로 이동(예약)
        CommanderManager.add(MoveCommand(marine, 50, 100))
        // 방업(예약)
        CommanderManager.add(UpgradeArmorCommand(marine))
        // 마지막 명령 취소
        CommanderManager.cancelLast()
        // 실제로 실행
        CommanderManager.executeAll()
    }
}