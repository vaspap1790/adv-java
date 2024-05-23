package com.example.advjava.general;

public class CSConcepts {

    /**
     * Parallelism refers to the simultaneous execution of multiple tasks or processes to achieve faster computation and improved performance.
     * In parallel computing, tasks are divided into smaller subtasks that can be executed concurrently on multiple processing units, such as CPU cores or distributed systems.
     * Parallelism is often used to exploit the capabilities of multicore processors and distributed systems to perform tasks more quickly than sequential execution.
     */

    /**
     * Concurrency refers to the ability of a system to execute multiple tasks or processes simultaneously, potentially overlapping in time.
     * In concurrent programming, tasks may start, run, and complete in overlapping time periods, but they don't necessarily execute simultaneously.
     * Concurrency allows multiple tasks to make progress in a shared environment, enabling efficient resource utilization and responsiveness in systems with multiple independent activities.
     */

    /**
     * Multithreading is a programming technique that enables multiple threads of execution to run concurrently within a single process.
     * Threads are lightweight processes within a program that share the same memory space and resources but have their own execution contexts.
     * Multithreading allows programs to perform multiple tasks concurrently, improving responsiveness and enabling better utilization of CPU resources.
     */

    /**
     * Multitasking refers to the ability of an operating system to execute multiple tasks or processes concurrently.
     * In a multitasking environment, the operating system switches between different tasks or processes rapidly, giving the illusion of simultaneous execution.
     * Multitasking can be achieved through techniques like time-sharing, where the CPU time is divided among multiple tasks, allowing each task to make progress.
     */

    /**
     * Multiprocessing is a computing technique that involves the simultaneous execution of multiple processes or programs on a multicore processor or multiple processors.
     * Each process runs independently and has its own memory space, allowing for true parallel execution of tasks.
     * Multiprocessing can significantly improve performance and scalability by distributing tasks across multiple processing units.
     */

    /**
     * Asynchronous programming is a programming paradigm that allows tasks to proceed independently of the main program flow.
     * Asynchronous programming enables non-blocking execution of tasks, where a program can continue to perform other operations while waiting for certain tasks, such as I/O operations or network requests, to complete.
     * Asynchronous programming is often used in event-driven and reactive programming paradigms, improving responsiveness and efficiency in applications with many concurrent operations.
     */

    /**
     * Dependency Injection
     * Makes a class independent of its dependencies.
     * It achieves that by decoupling the usage of an object from its creation.
     * Helps you to follow SOLID's dependency inversion and single responsibility principles
     * This way dependencies can be used and tested independently
     * Three types:
     * - Constructor Injection (Recommended)
     * - Setter Injection (hidden dependency may lead to null pointers)
     * - Field Injection (same problems apply + adds complexity because needs mutation or reflection)
     */
}
