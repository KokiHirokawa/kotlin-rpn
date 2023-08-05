import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun test() {
        val testCases = listOf(
            TestCase("2 3 +", 5),
            TestCase("100 50 +", 150),
            TestCase("7 5 + 15 +", 27),
            TestCase("10 1 -", 9),
            TestCase("1000 491 -", 509),
            TestCase("1 10 -", -9),
            TestCase("3 4 *", 12),
            TestCase("-1 99 *", -99),
            TestCase("-13 -13 *", 169),
            TestCase("10 2 /", 5),
            TestCase("10 100 /", 0),
            TestCase("-160 -10 /", 16),
            TestCase("1 5 + 3 * 10 2 / -", 13),
            TestCase("2 3 * 10 6 2 / + -", -7),
        )

        testCases.forEach { testCase ->
            assertEquals(
                testCase.expected,
                Calculator.run(testCase.input),
                testCase.input
            )
        }
    }
}

private data class TestCase(
    val input: String,
    val expected: Long
)