import java.util.Stack

class Calculator {

    companion object {
        fun run(formula: String): Long {
            val verbose = true
            val list = mutableListOf<Long>()

            formula.split(" ").forEach { token ->
                if (verbose) {
                    print("|")
                    list.forEach {
                        print(" $it |")
                    }
                    print(" $token |")
                    print("\n")
                }

                when (token) {
                    "+" -> {
                        val right = list.removeLast()
                        val left = list.removeLast()
                        list.add(left + right)
                    }
                    "-" -> {
                        val right = list.removeLast()
                        val left = list.removeLast()
                        list.add(left - right)
                    }
                    "*" -> {
                        val right = list.removeLast()
                        val left = list.removeLast()
                        list.add(left * right)
                    }
                    "/" -> {
                        val right = list.removeLast()
                        val left = list.removeLast()
                        list.add(left / right)
                    }
                    else -> {
                        list.add(token.toLong())
                    }
                }
            }

            if (verbose) {
                print("|")
                list.forEach {
                    print(" $it |")
                }
                print("\n")
            }

            return list.last()
        }
    }
}