import sys
from decimal import Decimal, ROUND_HALF_UP

input = sys.stdin.readline
print = sys.stdout.write

def round_decimal(value):
    return value.quantize(Decimal('1'), rounding=ROUND_HALF_UP)

def calculate_average():
    n = int(input().rstrip())
    if n == 0:
        return Decimal(0)

    levels = sorted([int(input().rstrip()) for _ in range(n)])
    exclude_count = int(round_decimal(Decimal(str(n * (15 / 100)))))

    trimmed_levels = levels[exclude_count:(n - exclude_count)]
    average = Decimal(sum(trimmed_levels)) / len(trimmed_levels)
    return round_decimal(average)

print(str(calculate_average()))