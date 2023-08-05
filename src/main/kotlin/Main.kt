fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage from gradle task: ./gradlew run --args=\"'1 2 +'\"")
    } else {
        println(Calculator.run(args[0]))
    }
}