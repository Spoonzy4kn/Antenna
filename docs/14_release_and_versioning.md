# Release and Versioning

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This document defines Antenna's release stages, versioning approach, changelog rules, and release checklist.

Exact build commands should be finalised after the Android project skeleton is committed.

---

## 2. Release stages

| Stage | Meaning |
| --- | --- |
| Planning | Documentation and project definition. |
| Pre-alpha | Buildable foundations, incomplete features, unstable. |
| Alpha | Core flows implemented, active defects expected. |
| Beta | Feature-complete enough for broader testing. |
| Version 1 | Version 1 scope complete and documented. |

---

## 3. Suggested version sequence

```text
0.0.1-prealpha
0.0.2-prealpha
0.1.0-alpha
0.2.0-alpha
0.5.0-beta
1.0.0
```

Version numbers should reflect maturity, not just commit count.

---

## 4. Build expectations

Expected future commands:

```bash
./gradlew clean
./gradlew assembleDebug
./gradlew test
./gradlew lint
./gradlew assembleRelease
```

The README must be updated once exact commands are available.

---

## 5. Release checklist

### Build

- [ ] Clean build passes.
- [ ] Debug build installs.
- [ ] Release build can be produced where relevant.
- [ ] Version number is correct.

### Tests

- [ ] Unit tests pass.
- [ ] UI tests pass where implemented.
- [ ] Critical manual QA flows pass.
- [ ] Accessibility spot checks pass.

### Privacy and security

- [ ] No secrets committed.
- [ ] No advertising SDKs included.
- [ ] No telemetry by default.
- [ ] No analytics by default.
- [ ] Permissions reviewed.
- [ ] Production logs reviewed.

### Documentation

- [ ] README updated.
- [ ] Functional requirements current.
- [ ] Architecture current.
- [ ] Decision log current.
- [ ] Changelog updated.
- [ ] Open questions updated.

---

## 6. Changelog rules

Use these sections where applicable:

- Added.
- Changed.
- Fixed.
- Removed.
- Security.
- Documentation.

Example:

```markdown
## 0.0.1-prealpha - 2026-06-30

### Added
- Initial documentation set.
```

---

## 7. GitHub release notes

Release notes should include:

- Version.
- Release stage.
- Main changes.
- Known limitations.
- Upgrade notes where relevant.
- Privacy/security notes where relevant.

---

## 8. Summary

Antenna should release deliberately. A release should communicate maturity, limitations, and user-facing change clearly.
