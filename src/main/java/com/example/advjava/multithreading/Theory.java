package com.example.advjava.multithreading;

public class Theory {

    /**
     *
     *                                                               Dedicated Resources          Shared Resources
     *                        Process 1     --->   Thread 1.1      Stack 1.1, Registers 1.1        Code 0, Heap 1,
     *   Program 0            -B                                                                      Files 1
     *   -A
     *   -B         --->
     *   -C                   Process 2     --->   Thread 2.1      Stack 2.1 , Registers 2.1       Code 0, Heap 2,
     *                        -A                                                                      Files 2
     *                        -C
     *                                      --->   Thread 2.2      Stack 2.2, Registers 2.2        Code 0, Heap 2,
     *                                                                                                 Files 2
     *
     */

    /**
     * Program: a sequence of instructions for a computer to execute
     */

    /**
     * Process: Actual execution of the Program
     * The instance of a computer program that is being executed by one or many threads
     */

    /**
     * Scheduler: Operating system module that selects the next jobs to be admitted into the system
     * and the next process to run
     * Ensures efficient distribution of the processor among our threads.
     * Assigns prioritization to these threads according to set rules
     */

    /**
     * Thread: Smallest sequence of programmed instructions that can be managed independently by the scheduler
     * Inter-thread communication within a Process is faster and more efficient than inter-process communication
     * Google Chrome innovation -> Each tab runs a Process (instead of a Thread) =>
     * fewer glitches, better memory management, higher performance
     */

    /**
     * Heap:
     */

    /**
     * Stack:
     */

    /**
     * Visibility: Changes made by one thread are visible to other threads.
     * Ensures READ operations are thread safe.
     */

    /**
     * Mutual Exclusion - Atomicity: Only one Thread can execute a block of code at a given time
     * or do updates on shared data.
     * Ensures WRITE operations are thread safe.
     */

}
