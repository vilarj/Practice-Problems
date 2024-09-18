import unittest

from Problems.monkey_trouble import MonkeyTrouble
from Problems.sleep_in import SleepIn


class TestCases(unittest.TestCase):
    """
     sleep_in(False, False) → True
     sleep_in(True, False) → False
     sleep_in(False, True) → True
     sleep_in(True, True) → True
    """
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

if __name__ == '__main__':
    unittest.main()
