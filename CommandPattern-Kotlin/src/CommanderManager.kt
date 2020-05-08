import java.util.*

object CommanderManager {
    val commands = ArrayList<Command>()

    fun add(command: Command) {
        commands.add(command)
    }

    fun cancelLast() {
        commands.removeAt(commands.size - 1)
    }

    fun executeAll() {
        // iterator
        for (command in commands) {
            command.execute()
        }
    }
}