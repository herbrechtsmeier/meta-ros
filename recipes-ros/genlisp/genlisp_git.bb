DESCRIPTION = "Common-Lisp ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg-native"

PR = "r1"

SRC_URI = "git://github.com/ros/${BPN}.git;branch=relocatable"
SRCREV = "42458c1d0a4ca1d3e78b8b1b2cac5e8fb2169a60"
PV = "0.4.11+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
