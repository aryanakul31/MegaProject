//
//  SplashView.swift
//  Urbanizer
//
//  Created by Nakul Arya on 04/07/25.
//
import SwiftUI

struct SplashView: View {
    @EnvironmentObject var router: NavigationRouter
    @State private var didNavigate = false

    var body: some View {
        VStack {
            Spacer()
            Image(systemName: "bolt.fill")
                .resizable()
                .frame(width: 100, height: 100)
                .foregroundColor(.blue)
            Text("Urbanizer")
                .font(.largeTitle)
                .bold()
            Spacer()
            ProgressView()
            Spacer().frame(height: 50)
        }
        .transition(.opacity)
        .onAppear {
            guard !didNavigate else { return }
            didNavigate = true
            DispatchQueue.main.asyncAfter(deadline: .now() + 2) {
                router.resetTo(.login)
            }
        }
    }
}

#Preview {
    SplashView().environmentObject(NavigationRouter())
}
