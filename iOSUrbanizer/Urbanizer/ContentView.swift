//
//  ContentView.swift
//  Urbanizer
//
//  Created by Nakul Arya on 04/07/25.
//

import SwiftUI

struct ContentView: View {
    @StateObject private var router = NavigationRouter()
    
    var body: some View {
        NavigationStack(path: $router.path) {
            Group {
                switch router.root {
                case .splash:
                    SplashView()
                case .login:
                    LoginView()
                case .home:
                    HomeView()
                }
            }
            .navigationDestination(for: AppRoute.self) { route in
                switch route {
                case .splash:
                    SplashView()
                case .login:
                    LoginView()
                case .home:
                    HomeView()
                }
            }
        }
        .environmentObject(router)
    }
}

#Preview {
    ContentView()
}
