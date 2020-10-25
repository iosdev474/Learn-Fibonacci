// Iterator data structure
struct FibIter(u32, u32);

// Iterator initialization function
fn fib() -> FibIter {
    FibIter(0u32, 1u32)
}

// Iterator trait implementation
impl Iterator for FibIter {
    type Item = u32;
    fn next(&mut self) -> Option<u32> {
        *self = FibIter(self.1, self.1 + self.0);
        Some(self.0)
    }
}

fn main() {
    println!("{:?}", fib().take(15).collect::<Vec<_>>());
}
