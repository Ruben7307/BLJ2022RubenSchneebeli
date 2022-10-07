cmake_minimum_required(VERSION 3.23)
project(LightsOut C)

set(CMAKE_C_STANDARD 99)

add_executable(LightsOut main.c utils.c utils.h)
