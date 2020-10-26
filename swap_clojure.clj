swap <- function(name1, name2, envir = parent.env(environment()))
{
    temp <- get(name1, pos = envir)
    assign(name1, get(name2, pos = envir), pos = envir)
    assign(name2, temp, pos = envir)
}

# Usage:

# > x <- 1
# > y <- 2
# > swap('x', 'y')
# > cat(x, y)

# Output:
# 2 1