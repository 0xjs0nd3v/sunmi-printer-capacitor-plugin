import Foundation

@objc public class SunmiPrinterPlugin: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
