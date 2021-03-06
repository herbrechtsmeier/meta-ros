DESCRIPTION = "\
This unary stack contains the dynamic_reconfigure package which provides a means to change \
node parameters at any time without having to restart the node."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=5ee5b8b046ae48ad94a2037ca953a67b"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9061fd30e5a04e8376eaddffaae86b07"
SRC_URI[sha256sum] = "4203b0a8389d9ac3203110b507d23fa353262cf26253f40abece6418d6c2bdd4"

SRC_URI += "file://0001-resolve-dynamic_reconfigure-path-in-installspace-at-.patch"

DEPENDS = "roscpp std-msgs roslib"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = "roslib"
