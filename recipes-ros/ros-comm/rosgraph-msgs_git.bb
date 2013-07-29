DESCRIPTION = "C++ ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation-native message-runtime-native std-msgs roscpp-serialization"

require ros-comm.inc

S = "${WORKDIR}/git/messages/${ROS_BPN}"
