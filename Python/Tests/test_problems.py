import unittest

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


if __name__ == '__main__':
    unittest.main()
