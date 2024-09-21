import unittest

from Problems.diff21 import Diff21
from Problems.monkey_trouble import MonkeyTrouble
from Problems.sleep_in import SleepIn
from Problems.sum_double import SumDouble


class TestCases(unittest.TestCase):
    def test_sleep_in(self):
        self.assertEqual(SleepIn().sleep_in(False, False), True)
        self.assertEqual(SleepIn().sleep_in(True, False), False)
        self.assertEqual(SleepIn().sleep_in(False, True), True)
        self.assertEqual(SleepIn().sleep_in(True, True), True)


    def test_monkey_trouble(self):
        self.assertEqual(MonkeyTrouble().monkey_trouble(True, True), True)
        self.assertEqual(MonkeyTrouble().monkey_trouble(False, False), True)
        self.assertEqual(MonkeyTrouble().monkey_trouble(True, False), False)
        self.assertEqual(MonkeyTrouble().monkey_trouble(False, True), False)


    def test_sum_double(self):
        self.assertIs(SumDouble.sum_double(1, 2), 3)
        self.assertIs(SumDouble.sum_double(3, 2), 5)
        self.assertIs(SumDouble.sum_double(2, 2), 8)
        self.assertIs(SumDouble.sum_double(-1, 0), -1)
        self.assertIs(SumDouble.sum_double(3, 3), 12)
        self.assertIs(SumDouble.sum_double(0, 0), 0)
        self.assertIs(SumDouble.sum_double(0, 1), 1)
        self.assertIs(SumDouble.sum_double(3, 4), 7)

    def test_diff21(self):
        self.assertIs(Diff21.diff21(19),2)
        self.assertIs(Diff21.diff21(10),11)
        self.assertIs(Diff21.diff21(21),0)
        self.assertIs(Diff21.diff21(22),2)
        self.assertIs(Diff21.diff21(25),8)


if __name__ == '__main__':
    unittest.main()
