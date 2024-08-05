// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "SunmiPrinterCapacitorPlugin",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "SunmiPrinterCapacitorPlugin",
            targets: ["SunmiPrinterPluginPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "SunmiPrinterPluginPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/SunmiPrinterPluginPlugin"),
        .testTarget(
            name: "SunmiPrinterPluginPluginTests",
            dependencies: ["SunmiPrinterPluginPlugin"],
            path: "ios/Tests/SunmiPrinterPluginPluginTests")
    ]
)