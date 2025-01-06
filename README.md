# Kotlin MutableList removeIf Bug

This repository demonstrates a subtle bug that can occur when using the `removeIf` function on a `MutableList` in Kotlin.  The issue arises from modifying the list while iterating over it using `removeIf`'s lambda expression. This can lead to elements being skipped and not removed as expected.

The `bug.kt` file contains the problematic code. The `bugSolution.kt` file shows a corrected version that uses iteration in reverse or creates a new list to avoid the issue.