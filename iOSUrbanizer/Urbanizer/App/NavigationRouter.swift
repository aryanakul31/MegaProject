//
//  NavigationRouter.swift
//  Urbanizer
//
//  Created by Nakul Arya on 04/07/25.
//

import SwiftUI

enum AppRoute: Hashable {
    case splash
    case login
    case home
}

class NavigationRouter: ObservableObject {
    @Published var path = NavigationPath()
    @Published var root: AppRoute = .splash
    
    func resetTo(_ route: AppRoute) {
        path = NavigationPath()
        root = route
    }
    
    func push(_ route: AppRoute) {
        path.append(route)
    }
    
    func pop() {
        path.removeLast()
    }
} 