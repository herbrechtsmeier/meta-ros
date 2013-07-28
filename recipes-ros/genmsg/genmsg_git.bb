DESCRIPTION = "Standalone Python library for generating ROS message and service data structures for various languages."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

PR = "r1"

RDEPENDS_${PN} = "python-stringold python-pprint"
RDEPENDS_${PN}_class-native = ""

SRC_URI = "git://github.com/ros/${BPN}.git;branch=relocatable"
SRCREV = "cb45b131576a898ced69e3e5e9758173365dc5cf"
PV = "0.4.21+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
