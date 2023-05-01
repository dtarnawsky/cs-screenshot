import UIKit
import Foundation
import Capacitor

public extension WKWebView {
    func disableScreenshots() {
        let field = UITextField()
        field.isSecureTextEntry = true
        field.translatesAutoresizingMaskIntoConstraints = false
        
        self.addSubview(field)
        field.isUserInteractionEnabled = false
        
        self.layer.superlayer?.addSublayer(field.layer)
        field.layer.sublayers?.first?.addSublayer(self.layer)
    }

    func enableScreenshots() {
        for view in self.subviews {
            if let textField = view as? UITextField {
                textField.isSecureTextEntry = false
                view.removeFromSuperview()
            }
        }
    }
}
