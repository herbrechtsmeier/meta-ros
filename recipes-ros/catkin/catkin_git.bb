DESCRIPTION = "Low-level build system macros and infrastructure for ROS"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake python-empy python-catkin-pkg python-empy-native python-catkin-pkg-native"
RDEPENDS_${PN}_class-native = ""

RDEPENDS_${PN} = "cmake make binutils binutils-symlinks gcc gcc-symlinks g++ g++-symlinks \
    python-catkin-pkg python-argparse python-misc python-multiprocessing \
    python-shell python-subprocess python-xml"

SRC_URI = "git://github.com/ros/${BPN}.git;branch=relocatable \
           file://0001-CATKIN_WORKSPACES-Don-t-require-.catkin-file.patch \
           "
SRCREV = "8067802506d0b66926b665ee301ca6ce77ab3deb"
PV = "0.5.71+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin

FILES_${PN}-dev += "\
    ${datadir}/eigen/cmake \
    ${datadir}/ros/cmake \
    ${prefix}/.catkin \
    ${prefix}/.rosinstall \
    ${prefix}/_setup_util.py \
    ${prefix}/env.sh \
    ${prefix}/setup.* \
    "

BBCLASSEXTEND += "native"
